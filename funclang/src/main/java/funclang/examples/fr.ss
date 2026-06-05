(define fr
  (lambda (op zero lst)
    (if (null? lst) zero
      (op (car lst) (fr op zero (cdr lst)))
    )
  )
)
