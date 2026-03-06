(define isSorted
  (lambda (lst)
    (if (null? lst) #t 
      (if (null? (cdr lst)) #t 
        (if (= (car lst) (car (cdr lst)))
          (isSorted (cdr lst))
          (if (> (car lst) (car (cdr lst)))
            (isSortedHelper (lambda (x y) (> x y)) (cdr lst))
            (isSortedHelper (lambda (x y) (< x y)) (cdr lst))
          )
        )
      )
    )
  )
)

(define isSortedHelper 
  (lambda (op lst)
    (if (null? (cdr lst)) #t 
      (if (= (car lst) (car (cdr lst)))
        (isSortedHelper op (cdr lst))
        (if (op (car lst) (car (cdr lst)))
          (isSortedHelper op (cdr lst))
          #f
        )
      )
    )
  )
)

