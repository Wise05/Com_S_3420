(define lst1 (list (cons 1 3) (cons 4 2) (cons 5 6)))
(define lst2 (list (cons 2 6) (cons 4 2) (cons 1 3)))

(define procList
  (lambda (op lst1 lst2)
    (if (checkLength lst1 lst2) 
      (procListHelper op lst1 lst2)
      (list)
    )
  )
)

(define procListHelper
  (lambda (op lst1 lst2)
    (if (null? lst1) (list)
      (cons 
        (op (car lst1) (car lst2)) 
        (procListHelper op (cdr lst1) (cdr lst2))
      )
    )
  )
)

(define checkLength
  (lambda (lst1 lst2)
    (if (null? lst1)
      (if (null? lst2) #t #f)
      (if (null? lst2) #f
        (checkLength (cdr lst1) (cdr lst2))
      )
    )
  )
)

(define add
  (lambda (p1 p2)
    (cons (+ (car p1) (car p2)) (+ (cdr p1) (cdr p2)))
  )
)
