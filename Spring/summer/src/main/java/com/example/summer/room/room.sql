CREATE TABLE room (
    id INT NOT NULL AUTO_INCREMENT,
    type VARCHAR(100) NOT NULL,
    price INT NOT NULL,
    accommodation_id INT,
    PRIMARY KEY (id)
);