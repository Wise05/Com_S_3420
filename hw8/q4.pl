extract_first_col([], [], []).
extract_first_col([[H|T] | Rows], [H|Col], [T|RestRows]) :-
  extract_first_col(Rows, Col, RestRows).

transpose([[]|_], []).
transpose(Matrix, [FirstCol | TransposedRest]) :-
  extract_first_col(Matrix, FirstCol, RestMatrix),
  transpose(RestMatrix, TransposedRest).

unique_row([]).
unique_row([H|T]):-
  \+ member(H, T),
  unique_row(T).

unique_rows([]).
unique_rows([Row|Rows]):- 
  unique_row(Row),
  unique_rows(Rows).

valid_row([]).
valid_row([H|T]):-
  Values = [1,2,3,4,5],
  member(H, Values),
  valid_row(T).

valid_matrix([]).
valid_matrix([Row|Rows]):-
  valid_row(Row),
  valid_matrix(Rows).

sudoku(Grid):- 
  valid_matrix(Grid),
  unique_rows(Grid),
  transpose(Grid, TransGrid),
  unique_rows(TransGrid).


