(ns exercises.gigasecond)

(defn g
  [y m d]
  (let [m (mod (+ m 9) 12) y (- y (quot m 10))]
    (+ (* 365 y) (quot y 4) (* -1 (quot y 100)) (quot y 400) (quot (+ (* m 306) 5) 10) (- d 1))))

(defn d
  [g]
  (let [y (quot (+ (* 10000 g) 14780) 3652425) ddd (- g (+ (* 365 y) (quot y 4) (* -1 (quot y 100)) (quot y 400)))]
    (let [ddd (if (< ddd 0)
                (- g (+ (* 365 (dec y)) (quot (dec y) 4) (* -1 (quot (dec y) 100)) (quot (dec y) 400)))
                ddd)
          mi (quot (+ (* 100 ddd) 52) 3060)
          mm (+ (mod (+ mi 2) 12) 1)
          dd (+ (- ddd (quot (+ (* mi 306) 5) 10)) 1)]
      [(+ y (quot (+ mi 2) 12)) mm dd])))

(defn gigasecond
  [year month day]
  (d (+ (g year month day) (quot 1000000000 (* 3600 24)))))
