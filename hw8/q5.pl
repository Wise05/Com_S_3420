is_operator('+').
is_operator('-').
is_operator('*').
is_operator('/').

program(Tokens):-
    expr(Tokens, []).

expr([X | Rest], Rest):-
    number(X).
expr([X | Rest], Rest):-
    atom(X),
    \+ is_operator(X),
    X \= 'let',
    X \= '(',
    X \= ')'.
expr(['(', 'let', '(' | Rest0], Rest):-
    bindings(Rest0, Rest1),
    Rest1 = [')' | Rest2],
    expr(Rest2, Rest3),
    Rest3 = [')' | Rest].
expr(['(', Op | Rest0], Rest):-
    is_operator(Op),
    args(Rest0, Rest).

args([')' | Rest], Rest).
args(Tokens0, Rest) :-
    expr(Tokens0, Tokens1),
    args(Tokens1, Rest).

bindings([')' | Rest], [')' | Rest]).
bindings(['(', Var | Rest0], Rest):-
    atom(Var),
    \+ is_operator(Var),
    Var \= 'let',
    Var \= '(',
    Var \= ')',
    expr(Rest0, Rest1),
    Rest1 = [')' | Rest2],
    bindings(Rest2, Rest).
