(define func
  (lambda (x)
    (+ (- (* 2 (* x x)) x) 1)
  )
)

(define Generate
  (lambda (x f z)
    (if (< z 1) (list)
      (cons (cons x (f x)) (Generate (+ x 1) f (- z 1)))
    )
  )
)

