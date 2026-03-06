(define compList
  (lambda (lst) 
    (if (null? lst) lst
      (cons (car lst) 
        (compListHelper (cdr lst) (car lst))
      )
    )
  )
)

(define compListHelper
  (lambda (lst prev)
    (if (null? lst) (list) 
      (if (= (car lst) prev)
        (compListHelper (cdr lst) prev)
        (cons (car lst) (compListHelper(cdr lst) (car lst)))
      )
    )
  )
)
