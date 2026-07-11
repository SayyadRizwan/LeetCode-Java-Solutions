select unique_id,name from Employees as e
left join employeeUNI as eu
on e.id=eu.id;
