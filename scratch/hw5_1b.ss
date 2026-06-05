(define countedges
  (lambda (target edges)
    (fl 
      (lambda (acc edge) 
        (if (= target (car edge))
          (+ acc 1)
          (if (= target (cdr edge))
            (+ acc 1)
          )
        )
      )
    )
  )
)

(define fl
  (lambda (op zero lst)
    (if (null? lst) zero
      (fl op (op zero (car lst)) (cdr lst)))
    )
  )
)
