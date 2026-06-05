sortList([],[]).

sortList([H|T],Sorted):- 
  sortList(T,SortedTail),
  insert(H, SortedTail, Sorted).

insert(X, [H|T], [H|O]):- 
  X > H, !,
  insert(X,T,O).
insert(X, T, [X|T]).

