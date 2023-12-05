addexclaim :: String -> String
addexclaim x = x ++ "!"

fourthletter :: String -> Char
fourthletter x = x !! 4

dropnine :: String -> String
dropnine x = drop 9 x

thirdLetter :: String -> Char
thirdLetter x = x !! 2

letterIndex :: String -> Int -> Char
letterIndex x y = x !! y
