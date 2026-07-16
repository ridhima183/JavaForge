package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
*Author : Bhavna
*Date : 14-Jul-2026
*Time :2:33:38 pm
*email :ridhima.gadalay@gmail.com
*/
public class EmployeeBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = Arrays.asList(
                new Employee(101, "Ravi Kumar", "IT", 55000, 4.6),
                new Employee(102, "Priya Sharma", "HR", 40000, 3.8),
                new Employee(103, "Arjun Mehta", "Sales", 30000, 4.2),
                new Employee(104, "Meera Joshi", "Finance", 70000, 4.9)
        );

        System.out.println("===== EMPLOYEE BILLING & PERFORMANCE SYSTEM =====\n");

        // 1️⃣ Predicate → Check high performers
        Predicate<Employee> isHighPerformer = emp -> emp.getRating() >= 4.5;
        System.out.println("⭐ High Performers:");
        employees.stream()
                .filter(isHighPerformer)
                .forEach(e -> System.out.println(e.getName() + " (" + e.getDepartment() + ")"));

        // 2️⃣ Function → Calculate yearly bonus (10% of salary for high performers)
        Function<Employee, Double> calculateBonus = emp ->
                isHighPerformer.test(emp) ? emp.getSalary() * 0.10 : emp.getSalary() * 0.05;

        System.out.println("\n💰 Yearly Bonus Calculation:");
        employees.forEach(emp ->
                System.out.println(emp.getName() + ": ₹" + calculateBonus.apply(emp)));

        // 3️⃣ Consumer → Display employee details
        Consumer<Employee> displayEmp = emp ->
                System.out.println("ID: " + emp.getId() + " | " + emp.getName() +
                        " | Dept: " + emp.getDepartment() +
                        " | Salary: ₹" + emp.getSalary());
        System.out.println("\n📋 Employee List:");
        employees.forEach(displayEmp);

        // 4️⃣ Supplier → Generate random 5-digit employee code
        Supplier<String> generateEmpCode = () -> "EMP" + (new Random().nextInt(90000) + 10000);
        System.out.println("\n🆔 Generated Employee Code: " + generateEmpCode.get());

        // 5️⃣ BiFunction → Calculate total cost to company (salary + bonus)
        BiFunction<Double, Double, Double> totalCTC = (salary, bonus) -> salary + bonus;
        System.out.println("\n🏦 Total CTC:");
        employees.forEach(emp -> {
            double bonus = calculateBonus.apply(emp);
            System.out.println(emp.getName() + ": ₹" + totalCTC.apply(emp.getSalary(), bonus));
        });

        // 6️⃣ BiPredicate → Check department and rating
        BiPredicate<Employee, String> isInDeptAndGoodRating =
                (emp, dept) -> emp.getDepartment().equalsIgnoreCase(dept) && emp.getRating() > 4.0;
        System.out.println("\n👩‍💼 IT Employees with Rating > 4:");
        employees.stream()
                .filter(emp -> isInDeptAndGoodRating.test(emp, "IT"))
                .forEach(emp -> System.out.println(emp.getName()));

        // 7️⃣ BiConsumer → Display employee and their total CTC
        BiConsumer<String, Double> showCTC = (name, ctc) ->
                System.out.println("Employee: " + name + " | Total CTC: ₹" + ctc);
        System.out.println("\n📊 Employee Final Compensation:");
        employees.forEach(emp -> {
            double bonus = calculateBonus.apply(emp);
            showCTC.accept(emp.getName(), totalCTC.apply(emp.getSalary(), bonus));
        });

	}

}
