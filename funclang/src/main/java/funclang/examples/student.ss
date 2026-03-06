(define student_grades (list (cons 0 90) (cons 1 85) (cons 2 92)))

(define get_scores
  (lambda (lst)
    (if (null? lst) (list)
      (cons (cdr (car lst)) (get_scores (cdr lst)))
    )
  )
)

(define combine
  (lambda (lst1 lst2)
    (if (checkLength lst1 lst2)
      (combineHelper lst1 lst2)
      (list)
    )
  )
)

(define combineHelper
  (lambda (lst1 lst2)
    (if (null? lst1) (list)
      (cons 
        (cons (car lst1) (car lst2)) 
        (combineHelper (cdr lst1) (cdr lst2))
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
