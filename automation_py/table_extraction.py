import pandas as pd

# from website
simpsons = pd.read_html("https://en.wikipedia.org/wiki/List_of_The_Simpsons_episodes")

print(len(simpsons))

print(simpsons[2])

# from pdf
import camelot

tables = camelot.read_pdf('foo.pdf', pages='1')
print(tables)
#export to csv
tables.export('foo.csv', f='csv', compress=True)
tables[0].to_csv('foo.csv')
