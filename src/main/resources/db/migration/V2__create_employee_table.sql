create table `employee` (
    `id` INT NOT NULL ,
    `name` VARCHAR(255) NOT NULL,
    `department_id` INT NOT NULL,
    `address` VARCHAR(255),
    `phone_number` VARCHAR(255),
    CONSTRAINT primary key(`id`),
    CONSTRAINT `fk_employee_department_id` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
);