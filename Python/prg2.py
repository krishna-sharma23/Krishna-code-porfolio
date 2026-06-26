import random

board = [['1', '2', '3'],['4', '5', '6'],['7', '8', '9']]
turn = random.choice(['X', 'O'])
winner = 'K'

def display_board():
    for row in board:
        print(row)

def update_board(pos):
    if pos > 5:
        r, c = 2, pos%6
    elif pos > 2:
        r, c = 1, pos%3
    else:
        r, c = 0, pos
    
    if board[r][c] in ('X', 'O'):
        print("This Space is already occupied please try again!!!!")
        return 'N'
    
    board[r][c] = turn
    return check(r, c)

def update_turn(turn):
    if turn == 'X':
        return 'O'
    else:
        return 'X'

def check(r, c):
    if all(board[i][c] == turn for i in range(3)):
        return turn
    
    if all(board[r][i] == turn for i in range(3)):
        return turn
    
    if r == c:
        if all(board[i][i] == turn for i in range(3)):
            return turn
        
    if r+c == 2:
        if all(board[i][2-i] == turn for i in range(3)):
            return turn
    
    return 'K'

def show_result(w):
    print(f"{w} Won the game🎉🎊")   


while True:
    display_board()
    print("Enter '-1' To exit")
    move = int(input(f"{turn}'s turn select a number btw 1 - 9 according to the place: "))
    if move == -1:
        break
    elif move > 9 or move < 1:
        print("Invalid move Input!!!!! Plz Try Again")
    else:
        win = update_board(move - 1)
        if win == 'K':
            turn = update_turn(turn)
        elif win == turn:
            show_result(win)
            break