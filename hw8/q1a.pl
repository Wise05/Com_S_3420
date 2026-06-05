fibonacci(0, []) :- !.
fibonacci(1, [0]) :- !.
fibonacci(2, [0, 1]) :- !.

fibonacci(N, List) :-
    N > 2,
    N1 is N - 1,
    fibonacci(N1, SoFar),
    last_two(SoFar, Penultimate, Last),
    Next is Penultimate + Last,
    append(SoFar, [Next], List).

last_two(L, Penultimate, Last) :-
    append(_, [Penultimate, Last], L).





