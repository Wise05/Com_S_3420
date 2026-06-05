find_match(Words, Len1, Len2, SharedIndex1, SharedIndex2, W1, W2):- 
  member(W1, Words),
  member(W2, Words),
  W1 \= W2,

  atom_length(W1, Len1),
  atom_length(W2, Len2),

  sub_atom(W1, SharedIndex1, 1, _, Char), 
  sub_atom(W2, SharedIndex2, 1, _, Char).

