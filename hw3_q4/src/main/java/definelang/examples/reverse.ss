(define reverse
  (lambda (lst) 
    (let reverseHelper
      (lambda (lst reversed)
        (if (null? lst) reversed
          (reverseHelper (cdr lst) (cons (car lst) reversed))
        )
      )
    )
  )
)


