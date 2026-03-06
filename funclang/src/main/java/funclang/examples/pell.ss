(define pell 
  (lambda (n) 
    (cons 0 (cons 1 (pellHelper (- n 1) 1 0)))
  )
)

(define pellHelper
  (lambda (n nsub1 nsub2)
    (if (= n 0) (list)
      (if (= n 1) (list)
        (let ((next (+ (* 2 nsub1) nsub2))) 
          (cons next (pellHelper (- n 1) next nsub1))
        )
      )
    )
  )
)
