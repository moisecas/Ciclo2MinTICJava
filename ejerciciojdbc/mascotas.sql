CREATE TABLE `responsable` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombres` varchar(200) NOT NULL,
  `apellidos` varchar(200) NOT NULL,
  `edad` int
);

CREATE TABLE `mascota` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `especie` varchar(50) NOT NULL,
  `edad` int,
  `responsable_id` int
);

ALTER TABLE `mascota` ADD FOREIGN KEY (`responsable_id`) REFERENCES `responsable` (`id`);
