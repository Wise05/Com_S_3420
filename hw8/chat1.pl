parent(terance, kevin).
parent(kevin, james).
parent(kevin, sarah).
male(terance).
male(kevin).
male(james).
female(sarah).

father(X,Y):- 
  parent(X,Y),
  male(X).

grandfather(X,Z):- 
  father(X,Y),
  father(Y,Z).

count_elements([], 0).
count_elements([_|T], Count):-
  count_elements(T, N),
  Count is N + 1.

is_member(Element, [Element|_]).
is_member(Element, [_|T]):-
  is_member(Element, T).

count_acc(List, Count):- count_worker(List, 0, Count).

count_worker([], Acc, Acc).
count_worker([H|T], Acc, Count):-
  N is Acc + 1,
  count_worker(T, N, Count).

reverse_list(List, Reversed):- reverse_helper(List, [], Reversed).

reverse_helper([], Acc, Acc).
reverse_helper([H|T], Acc, Result):-
  reverse_helper(T, [H|Acc], Result).


