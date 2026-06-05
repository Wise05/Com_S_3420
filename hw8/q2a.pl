filterlist([],_,[]).

filterlist([Target|T], Target, Out):-
  !,
  filterlist(T, Target, Out).

filterlist([H|T], Target, [H|Out]):-
  filterlist(T, Target, Out).

