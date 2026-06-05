item(apple, 2).
item(banana, 1).
item(steak, 15).
item(milk, 4).

expensive_items(List, MinPrice, ResultList):- ex_items_helper(List, MinPrice, [], ResultList).

ex_items_helper([], MinPrice, Acc, Acc).
ex_items_helper([H|T], MinPrice, Acc, Filtered):- 
  item(H, Price),
  Price > MinPrice,
  ex_items_helper(T, MinPrice, Acc, Filtered).
ex_items_helper([H|T], MinPrice, Acc, Filtered):- 
  item(H, Price),
  Price < MinPrice,
  ex_items_helper(T, MinPrice, [H|Acc], Filtered).

sum_list(List, Sum):- sum_list_helper(List, 0, Sum).

sum_list_helper([], Acc, Acc).
sum_list_helper([H|T], Acc, Sum):- 
  item(H, Price),
  NewAcc is Price + Acc,
  sum_list_helper(T, NewAcc, Sum).



