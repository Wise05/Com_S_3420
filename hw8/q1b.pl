primes([2,3,5,7,11,13,17,19,23,29,31]).

% N is prime if it is in our list OR if it's not divisible by anything in our list
isprime(N) :-
    primes(List),
    member(N, List), !. % If it's literally in our list, it's prime.

isprime(N) :-
    N > 1,
    primes(List),
    % We use \+ to say: "It is NOT the case that some P in our list divides N"
    \+ (member(P, List), P < N, 0 is N mod P).

is_divisible(X, Y) :-
    Y \= 0,
    0 is X mod Y.
