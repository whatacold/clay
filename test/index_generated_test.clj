(def var0 nil)


(def
 var1
 [:img
  {:style {:width "100px"},
   :src
   "https://raw.githubusercontent.com/scicloj/clay/main/resources/Clay.svg.png",
   :alt "Clay logo"}])


(def var2 nil)


(def
 var3
 ["(require '[scicloj.clay.v2.api :as clay])\n(clay/make! {:source-path \"notebooks/index.clj\"})"])


(def var4 nil)


(def
 var5
 (->>
  [["June 10th 2023" "An early overview - babashka-conf" "HvhMsv3iVGM"]
   ["Dec. 1st 2023"
    "Kindly & Clay overview - visual-tools group - see Daniel's & Tim's parts"
    "DAQnvAgBma8"]
   ["Dec. 12th 2023"
    "Demo & Clay overview - London Clojurians - see Tim's part"
    "skMMvxWjmNM"]
   ["Dec. 16th 2023" "Calva integration - datavis demo" "X_SsjhmG5Ok"]
   ["Dec. 17th 2023"
    "CIDER integration - image processing demo"
    "fd4kjlws6Ts"]
   ["Dec. 17th 2023"
    "Cursive integration, API, configuration - blogging demo"
    "GsML75MtNXw"]]
  reverse
  (map
   (fn
    [[date title youtube-id]]
    [:tr [:td date] [:td title] [:td {:youtube-id youtube-id}]]))
  (into [:table])))


(def var6 nil)


(def
 var7
 ["(do (require '[scicloj.clay.v2.api :as clay])\n    (clay/make! {:single-form '~form-before-caret\n                 :source-path [\"~file-path\"]}))"])


(def var8 nil)


(def
 var9
 ["(do (require '[scicloj.clay.v2.api :as clay])\n    (clay/make! {:source-path [\"~file-path\"]}))"])


(def var10 nil)


(ns
 index-generated-test
 (:require
  [scicloj.kindly.v4.api :as kindly]
  [scicloj.kindly.v4.kind :as kind]
  [scicloj.clay.v2.quarto.highlight-styles :as quarto.highlight-styles]
  [scicloj.clay.v2.quarto.themes :as quarto.themes]
  [scicloj.metamorph.ml.toydata :as toydata]
  [scicloj.hanamicloth.v1.api :as haclo]
  [tablecloth.api :as tc]
  [clojure.string :as str]
  [clojure.test :refer [deftest is]]))


(def var12 nil)


(def
 var13
 (kind/hiccup
  [:div
   {:style {:background "#efe9e6", :border-style :solid}}
   [:ul [:li "one"] [:li "two"] [:li "three"]]]))


(def var14 nil)


(def
 var15
 (->
  {:x (range 5), :y (repeatedly 5 rand)}
  tc/dataset
  (tc/set-dataset-name "my dataset")))


(def var16 nil)


(def
 var17
 (->
  (toydata/iris-ds)
  (haclo/plot
   haclo/rule-chart
   {:=x :sepal_width,
    :=x2 :sepal_length,
    :=y :petal_width,
    :=y2 :petal_length,
    :=color :species,
    :=color-type :nominal,
    :=mark-size 3,
    :=mark-opacity 0.2})))


(def var18 nil)


(def var19 (require '[scicloj.clay.v2.api :as clay]))


(def var20 nil)


(def
 var21
 (comment
  (clay/make! {:format [:html], :source-path "notebooks/index.clj"})))


(def var22 nil)


(def var23 (comment (clay/make! {:source-path "notebooks/index.clj"})))


(def var24 nil)


(def
 var25
 (comment
  (clay/make! {:source-path "notebooks/index.clj", :show false})))


(def var26 nil)


(def
 var27
 (comment
  (clay/make!
   {:source-path "notebooks/index.clj",
    :favicon "notebooks/favicon.ico"})))


(def var28 nil)


(def
 var29
 (comment
  (clay/make!
   {:source-path ["notebooks/slides.clj" "notebooks/index.clj"],
    :show false})))


(def var30 nil)


(def
 var31
 (comment
  (clay/make!
   {:source-path "notebooks/index.clj", :single-form '(+ 1 2)})))


(def var32 nil)


(def var33 (comment (clay/make! {:single-form '(+ 1 2)})))


(def var34 nil)


(def var35 (comment (clay/make! {:single-value 3})))


(def var36 nil)


(def
 var37
 (comment
  (clay/make!
   {:single-value 3333,
    :post-process (fn [html] (-> html (str/replace #"3333" "4444")))})))


(def var38 nil)


(def
 var39
 (comment
  (clay/make!
   {:source-path "notebooks/index.clj", :hide-ui-header true})))


(def var40 nil)


(def
 var41
 (comment
  (clay/make!
   {:source-path "notebooks/index.clj", :hide-info-line true})))


(def var42 nil)


(def
 var43
 (comment
  (clay/make!
   {:format [:quarto :html], :source-path "notebooks/index.clj"})))


(def var44 nil)


(def
 var45
 (comment
  (clay/make!
   {:format [:quarto :html],
    :source-path "notebooks/index.clj",
    :run-quarto false})))


(def var46 nil)


(def
 var47
 (comment
  (clay/make!
   {:format [:quarto :html], :source-path "notebooks/slides.clj"})))


(def var48 nil)


(def
 var49
 (comment
  (clay/make!
   {:format [:quarto :revealjs], :source-path "notebooks/slides.clj"})))


(def var50 nil)


(def
 var51
 (comment
  (clay/make!
   {:format [:quarto :html],
    :source-path "notebooks/index.clj",
    :quarto
    {:highlight-style :nord, :format {:html {:theme :journal}}}})))


(def var52 nil)


(def
 var53
 (comment
  (require
   '[scicloj.clay.v2.quarto.highlight-styles
     :as
     quarto.highlight-styles]
   '[scicloj.clay.v2.quarto.themes :as quarto.themes])
  (clay/make!
   {:format [:quarto :html],
    :source-path "notebooks/index.clj",
    :quarto
    {:highlight-style quarto.highlight-styles/nord,
     :format {:html {:theme quarto.themes/journal}}}})))


(def var54 nil)


(def
 var55
 (comment
  (clay/make!
   {:base-source-path "notebooks/", :source-path "index.clj"})))


(def var56 nil)


(def
 var57
 (comment
  (clay/make!
   {:format [:quarto :html],
    :base-source-path "notebooks",
    :source-path
    ["chapter.clj"
     "another_chapter.md"
     "a_chapter_with_R_code.Rmd"
     "test.ipynb"],
    :base-target-path "book",
    :book {:title "Book Example"},
    :clean-up-target-dir true})))


(def var58 nil)


(def
 var59
 (comment
  (clay/make!
   {:format [:quarto :html],
    :base-source-path "notebooks",
    :source-path ["index.clj" "chapter.clj" "another_chapter.md"],
    :base-target-path "book",
    :book {:title "Book Example", :favicon "notebooks/favicon.ico"},
    :clean-up-target-dir true})))


(def var60 nil)


(def
 var61
 (comment
  (clay/make!
   {:format [:quarto :html],
    :base-source-path "notebooks",
    :source-path
    [{:part "Part A", :chapters ["index.clj" "chapter.clj"]}
     {:part "Part B", :chapters ["another_chapter.md"]}],
    :base-target-path "book",
    :book {:title "Book Example"},
    :clean-up-target-dir true})))


(def var62 nil)


(def var63 (comment (clay/browse!)))


(def var64 nil)


(def
 var65
 (comment (clay/make-hiccup {:source-path "notebooks/index.clj"})))


(def var66 nil)


(def
 var67
 (->>
  ["purple" "darkgreen" "brown"]
  (mapcat
   (fn
    [color]
    [(kind/md (str "### subsection: " color))
     (kind/hiccup
      [:div
       {:style {:background-color color, :color "lightgrey"}}
       [:big [:p color]]])]))
  kind/fragment))


(def var68 (->> (range 3) kind/fragment))


(def var69 nil)


(def var70 (kind/fn [+ 1 2]))


(def var71 nil)


(def
 var72
 (kind/fn {:kindly/f (fn [{:keys [x y]}] (+ x y)), :x 1, :y 2}))


(def var73 nil)


(def
 var74
 (kind/fn [tc/dataset {:x (range 3), :y (repeatedly 3 rand)}]))


(def
 var75
 (kind/fn {:kindly/f tc/dataset, :x (range 3), :y (repeatedly 3 rand)}))


(def var76 nil)


(def var77 (delay (Thread/sleep 500) (+ 1 2)))


(def var78 nil)


(def var79 (kind/hiccup [:img {:src "notebooks/images/Clay.svg.png"}]))


(def
 var80
 (kind/vega-lite
  {:data {:url "notebooks/datasets/iris.csv"},
   :mark "rule",
   :encoding
   {:opacity {:value 0.2},
    :size {:value 3},
    :x {:field "sepal_width", :type "quantitative"},
    :x2 {:field "sepal_length", :type "quantitative"},
    :y {:field "petal_width", :type "quantitative"},
    :y2 {:field "petal_length", :type "quantitative"},
    :color {:field "species", :type "nominal"}},
   :background "floralwhite"}))


(def var81 nil)


(def var82 (+ 1 2))


(deftest test83 (is (> var82 2.9)))


(deftest test84 (is (> var82 2.9)))


(deftest test85 (is (> var82 2.9)))


(def var86 nil)


(def
 var87
 (kindly/hide-code
  (kind/code
   "(kind/test-last [> 2.9])\n\n^kind/test-last\n[> 2.9]\n\n(kindly/check > 2.9)")))


(def var88 nil)


(def
 var89
 (kind/table
  {:column-names ["A" "B" "C"], :row-vectors [[1 2 3] [4 5 6]]}
  {:class "table-responsive", :style {:background "#f8fff8"}}))


(def var90 nil)


(def
 var91
 (kindly/hide-code
  (kindly/merge-options! {:code-and-value :horizontal})
  false))


(def var92 (+ 1 2))


(def var93 (+ 3 4))


(def var94 nil)


(def
 var95
 (kindly/hide-code
  (kindly/merge-options! {:code-and-value :vertical})
  false))


(def var96 (+ 1 2))


(def var97 (+ 3 4))


(def var98 nil)


(def
 var99
 (kindly/hide-code
  (kindly/merge-options! {:style {:background-color "#ccddee"}})
  false))


(def var100 (kind/hiccup [:div [:p "hello"]]))


(def var101 nil)


(def var102 (tc/dataset {:x (range 3)}))


(def var103 nil)


(def var104 (kind/hiccup [:div (tc/dataset {:x (range 3)})]))


(def var105 nil)


(def
 var106
 (kindly/hide-code
  (kindly/merge-options! {:style {:background-color nil}})
  false))


(def var107 (kind/hiccup [:div [:p "hello"]]))
