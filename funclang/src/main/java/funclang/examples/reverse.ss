(define reverse
  (lambda (lst) 
    (reverseHelper lst (list))
  )
)

(define reverseHelper
  (lambda (lst reversed)
    (if (null? lst) reversed
      (reverseHelper (cdr lst) (cons (car lst) reversed))
    )
  )
)

