import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    return students[students['name'].notnull()]  new frame
    #return students.dropna(subset=['name'])
