module EllipticPoint (EllipticPoint (..)) where

import Point

data EllipticPoint = EllipticPoint
  { point :: Point,
    a :: Integer,
    b :: Integer
  }
  deriving (Show)

instance Eq EllipticPoint where
  (EllipticPoint point1 a1 b1) == (EllipticPoint point2 a2 b2) = point1 == point2
