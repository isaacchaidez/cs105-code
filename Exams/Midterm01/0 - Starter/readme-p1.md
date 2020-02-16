# P1 - Retirement Calculator

Write the implementation for a retirement calculator that meets the requirements below

## Requirements

The formula for monthly retirement compensation is **Years of Service Credit x Age Factor x Final Monthly** Employment Compensation where:

- Age Factor is determined in the lookup table below
- Final Compensation is the monthly income at the time of retirement.  Note: in most retirement formulas, there is a concept of highest average compensation which is often something like the average of the monthly salary over the preceding 36 months

The Retirement calculator should have the following methods

- **Constructor** (age, years service credit, final annual compensation)
- **getMontlyRetirementBenefit** - returns the monthly retirement benefit based upon the retirement compensation formula
- **getAnnualRetirementBenefit** - returns the annual retirement benefit based upon the retirement compensation formula
- **getRetirementPercentage** - returns the % of their employment income the employee will receive in retirement - This is the Age Factor * Number of Years of Service

**Special Requirements**

- Use a parallel if statement in the age factor calculation

- Use a single if condition to handle age between 55 and 60 and calculate the factor based upon the a base of 1.4 and use the regular increment between years to calculate the increase in age factor

- Below 55 should return zero

  

## Example

Joe Gaucho is retiring from the State of Confusion's Teachers Retirement System after 30 years of service. He is 59 years old.  He makes $90,600 / year. He is in the 2% at age 60 plan

Current Monthly Compensation = $90,600 / 12 = $7,550

[Retirement Compensation = Years of Service Credit x Age Factor x Final Monthly]

Retirement Compensation = 30 x 1.880% x $7,550 = 30 x .01880  x 7550 =$4,258.20

Simplified Age Factor Table for the 2% at Age 60 Plan

| Age  | Age Factor |
| ---- | ---------- |
| 55   | 1.400      |
| 56   | 1.520      |
| 57   | 1.640      |
| 58   | 1.760      |
| 59   | 1.880      |
| 60   | 2.000      |
| 61   | 2.133      |
| 62   | 2.267      |
| 63+  | 2.400      |

