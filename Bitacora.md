# Tarea: Refactoring - GILDED ROSE

## Code Smells Encontrados
- Large Class
- Long Method
- Divergent Change
- Magic Number
- Magic String

## Principios SOLID que no se cumplen
- Principio OCP(Open/Closes Principle) el método updateQuality rompe este principio
  al no permitir extender la funcionalidad de un nuevo Item sin tener que modificar la clase misma.
  
- Principio SRP(Single Responsibility Principle) la clase GildedRose rompe este principio 
  al ser la única responsable de determinar la calidad de todo el catálogo de Items.
  
## Técnica de Refactor Utilizadas
- Extract Method
- Extract Variable
- Replace Constructor with Factory Method
- Extract Interface  
- Move Method
- Hide Delegate