module Print3Broken where

printSecond :: IO ()
printSecond = do
    putStrLn greeting
    printSecond
  where
    greeting = "yaaarrrr"
