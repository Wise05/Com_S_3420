(define hdistance
  (lambda (lst1 lst2)
    (if (sameLength lst1 lst2)
      (fl2 
        (lambda (zero a b)
          (if (= a b) (+ zero 0) (+ zero 1))
        )
        0 lst1 lst2
      )
      -1
    )
  )
)

(define sameLength
  (lambda (lst1 lst2)
    (if (null? lst1)
      (if (null? lst2) #t #f)
      (if (null? lst2) #f
        (sameLength (cdr lst1) (cdr lst2))
      )
    )
  )
)

(define fl2
  (lambda (op zero lst1 lst2)
    (if (null? lst1) zero
      (fl2 op (op zero (car lst1) (car lst2)) (cdr lst1) (cdr lst2))
    )
  )
)


