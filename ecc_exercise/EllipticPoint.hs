module EllipticCurve (EllipticCurve (..)) where

data EllipticCurve = EllipticCurve
  { a :: Integer,
    b :: Integer
  }
  deriving (Eq, Show)
