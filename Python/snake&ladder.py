import random

snakes  = {17: 7, 54: 34, 62: 19, 64: 60, 87: 24, 93: 73, 95: 75, 99: 78}
ladders = {4: 14, 9: 31, 20: 38, 28: 84, 40: 59, 51: 67, 63: 81, 71: 91}

def dice_roll():
    return random.randrange(1, 7)

def display_board(pos):
    for i in range(9, -1, -1):
        for j in range(9, -1, -1):
            if (i * 10 + j + 1) == pos['P1']:
                print('[P1]', end='')
            elif (i * 10 + j + 1) == pos['P2']:
                print('[P2]', end='')
            else:
                print('[  ]', end='')
        print()

def display_status(pos):
    print(pos)

def check_snake_ladder(pos, turn):
    for snake in snakes.keys():
        if pos[turn] == snake:
            pos[turn] = snakes[snake]
    for ladder in ladders.keys():
        if pos[turn] == ladder:
            pos[turn] = ladders[ladder]
    
    return pos

def check_winner(pos, turn):    
    if pos[turn] == 100:
        return True
    return False

def display_result(turn):
    if turn == 'P1':
        print(f"Congratulations!!🎉🎉 {p1} won the game")
    else:
        print(f"Congratulations!!🎉🎉 {p2} won the game")

def update_turn(turn):
    if turn == 'P1':
        return 'P2'
    return 'P1'

def main():
    position = {'P1' : 0, 'P2' : 0}
    opt = input("Enter 'S' to start the game \n Enter 'E' to Exit\n")
    turn = random.choice(['P1', 'P2'])
    if opt == 'S':
        while True:
            o = input(f"Player {turn}'s turn \n Enter 'R' to Roll the dice: ")
            if o == 'R':
                steps = dice_roll()
                print(f"You Rolled a {steps}")
                position[turn] += steps
                if position[turn] > 100:
                    position[turn] -= steps
                    print(f"You need a {100 - position[turn]} to win!!")
                position = check_snake_ladder(position, turn)
                check = check_winner(position, turn)
                if check:
                    display_result(turn)
                    break
                else:
                    display_board(position)
                    turn = update_turn(turn)
            elif o in 'Ee':
                break
            else:
                print("Invalid Input! Try Again")
    else:
        print("Game Exited")

p1 = input("Enter the name of Player 1: ")
p2 = input("Enter the name of Player 2: ")
main()