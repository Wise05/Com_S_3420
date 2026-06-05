(define swap: ((Ref num, Ref num) -> (Ref num, Ref num))
  (lambda (p:(Ref num, Ref num))
    (let ((a:num (deref (car p))) (b:Ref num (cdr p)))
      (let
        (
         (quiet:num (set! (car p) (deref b)))
         (silence:num (set! b a))
        )
        p
      )
    )
  )
)

(define print: ((Ref num, Ref num) -> (num, num))
  (lambda (p: (Ref num, Ref num))
    (cons
      (deref (car p)) (deref (cdr p))
    )
  )
)
