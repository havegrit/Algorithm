userInput = input().split(' ')
N = int(userInput[0])
M = int(userInput[1])

answer = 65
board = [0]* N
W = 'W'
B = 'B'
whiteStarts = [W, B, W, B, W, B, W, B]
blackStarts = [B, W, B, W, B, W, B, W]
whiteStartChessBoard = [
  whiteStarts,
  blackStarts,
  whiteStarts,
  blackStarts,
  whiteStarts,
  blackStarts,
  whiteStarts,
  blackStarts
]
blackStartChessBoard = [
  blackStarts,
  whiteStarts,
  blackStarts,
  whiteStarts,
  blackStarts,
  whiteStarts,
  blackStarts,
  whiteStarts
]

for i in range(0, N):
  board[i] = input()

for i in range(0, N-7):
  for j in range(0, M-7):
    cnt = 0
    cntRepaint = 0
    whiteStartRepaintCount = 0
    blackStartRepaintCount = 0
    for partOfBoard in board[i:i+8]:
      for a, b in zip(partOfBoard[j:j+8], whiteStartChessBoard[cnt]):
        if a != b:
          whiteStartRepaintCount += 1
      for a, b in zip(partOfBoard[j:j+8], blackStartChessBoard[cnt]):
        if a != b:
          blackStartRepaintCount += 1
      cnt += 1
    repaintCount = whiteStartRepaintCount if whiteStartRepaintCount < blackStartRepaintCount else blackStartRepaintCount
    if repaintCount < answer:
      answer = repaintCount

print(answer)