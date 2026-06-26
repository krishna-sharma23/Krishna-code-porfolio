import pandas as pd

Pokemons = pd.read_csv("archive/pokemon.csv", index_col = "#")

Kanto = Pokemons[Pokemons["Generation"] == 1]
Johto = Pokemons[Pokemons["Generation"] == 2]
Hoenn = Pokemons[Pokemons["Generation"] == 3]
Sinnoh = Pokemons[Pokemons["Generation"] == 4]
Unova = Pokemons[Pokemons["Generation"] == 5]
Kalos = Pokemons[Pokemons["Generation"] == 6]
Legendary = Pokemons[Pokemons["Legendary"]]

print(Legendary)