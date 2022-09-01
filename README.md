# Caso 2 Poo

Estudiante: Dayana Xie Li
Curso: Programación orientada a objetos
Carnet: 2022097967

## Descripción del caso

Retomando el tema del yatch silent 60, el yate de energía solar, se quiere hacer una demostración de la eficiencia del consumo y carga energética del yate. para ello es necesario parametrizar valores de configuración como capacidad de carga de las baterías, velocidad de carga desde los paneles dependiendo de los niveles de sol a los que estén expuestos los páneles, velocidad en nudos del navío y el consumo de energía según la velocidad.

## Diseño 

En mi programa de carga del yate, se modifica la carga y consumo de energía por medio de la clase llamada "Simulator", por medio de los métodos "config_solar_panel" y "config_battery" . La idea es que estos sean llamados desde la clase principal llamada Yacht, en donde desde ahí se llaman a los métodos de la clase simulator, pasándole por parámetro los valores que queremos modificar del panel y la batería, ya sea su carga, su consumo, velocidad, entre otros.
