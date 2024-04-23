import java.util.ArrayList;
//public class StepTracker
//{
 /* to be implemented here */
//} 
public class StepTracker 1 /* to be implemented here */ private int minSteps, totalSteps; private int totalDays, actDays; public StepTracker(int goal) minsteps = goal; totalSteps = 0; totalDays = 0; actDays = 0; } public void addDailySteps(int steps) totalSteps += steps; totalDays++; if (steps >= minSteps) actdays++; } public int activeDays() return actDays; } public double averageSteps() { if (totalDays == 0) return 0.0; else return (double)totalSteps / totalDays;}}
