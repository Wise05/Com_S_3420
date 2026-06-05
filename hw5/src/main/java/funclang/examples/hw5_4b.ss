(define infinity
  (lambda (x)
    (infinity (+ x 1))
  )
)

(infinity 0)
