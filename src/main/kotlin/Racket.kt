/** Raquete refletora do jogo**/
data class Racket(val positions: Position, val width: Int, val height: Int)
val center = Racket(positions = Position(x = 150, y = 560), 40, 10)
val tip = Racket(Position(x = 125, y = 560), 10, 10)
val mid = Racket(Position(x = 135, y = 560), 15, 10)


