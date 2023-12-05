module Learn where

x = 7
y = 10
f = x + y

-- function with where

printInc n = print plusTwo
  where
    plusTwo = n + 2

printInc2 n =
    let plusTwo = n + 2
     in print plusTwo
