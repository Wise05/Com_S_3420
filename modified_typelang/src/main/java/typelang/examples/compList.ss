(define compListHelper: (List<num> num -> List<num>)
  (lambda (lst:List<num> prev:num)
    (if (null? lst) (list:num) 
      (if (= (car lst) prev)
        (compListHelper (cdr lst) prev)
        (cons (car lst) (compListHelper (cdr lst) (car lst)))
      )
    )
  )
)

(define compList: (List<num> -> List<num>)
  (lambda (lst: List<num>) 
    (if (null? lst) lst
      (cons (car lst) 
        (compListHelper (cdr lst) (car lst))
      )
    )
  )
)


