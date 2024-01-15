import pandas as pd

target = "https://football-data.co.uk/data.php"

# reading 1 csv file from website
df_premier21 = pd.read_csv("https://football-data.co.uk/mmz4281/2324/E0.csv")

print(df_premier21)

#renaming df
df_premier21.rename(columns={"FTAG": 'home_goals', "FTHG": 'away_goals'})

print(df_premier21)
