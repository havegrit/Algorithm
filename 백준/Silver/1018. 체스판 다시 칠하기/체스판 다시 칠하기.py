def count_repaint(board_segment, reference_board):
    repaint_count = 0
    for row, ref_row in zip(board_segment, reference_board):
        for cell, ref_cell in zip(row, ref_row):
            if cell != ref_cell:
                repaint_count += 1
    return repaint_count

def min_repaint_chess_board(N, M, board):
    answer = float('inf')
    board_size = 8

    white_starts = ['W', 'B'] * 4
    black_starts = ['B', 'W'] * 4

    white_start_chess_board = [white_starts if i % 2 == 0 else black_starts for i in range(board_size)]
    black_start_chess_board = [black_starts if i % 2 == 0 else white_starts for i in range(board_size)]

    for i in range(N - board_size + 1):
        for j in range(M - board_size + 1):
            board_segment = [row[j:j + board_size] for row in board[i:i + board_size]]

            white_repaint = count_repaint(board_segment, white_start_chess_board)
            black_repaint = count_repaint(board_segment, black_start_chess_board)

            answer = min(answer, white_repaint, black_repaint)

    return answer

user_input = input().split()
N = int(user_input[0])
M = int(user_input[1])

board = [input() for _ in range(N)]
print(min_repaint_chess_board(N, M, board))