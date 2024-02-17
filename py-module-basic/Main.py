import os

import numpy as np


def best_fit_line(x, y, filename):
    coefficients = np.polyfit(x, y, 1)
    polynomial = np.poly1d(coefficients)
    line_x = np.linspace(min(x), max(x), 100)
    line_y = polynomial(line_x)
    result = np.column_stack((line_x, line_y))
    np.savetxt(os.path.expanduser(f'~/{filename}'), result)

    best_fit_line(10, 10, "myfile.csv")


def calculate_mean(x, y):
    return np.mean(x), np.mean(y)


def calculateaveragenumber(x, y):
    return (x + y) / 2

