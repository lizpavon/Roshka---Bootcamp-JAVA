--1. Top clientes con más facturas
/*select c.id, c.nombre, c.apellido, c.nro_cedula, count(f.cliente_id) from factura f join cliente c on c.id = f.cliente_id
group by c.id, c.nombre, c.apellido, c.nro_cedula
order by count(f.cliente_id) desc*/

--2. Top clientes que más gastaron
/*select c.nombre as cliente, SUM(round(fd.cantidad*p.precio)) as gasto
from factura_detalle fd join producto p on fd.producto_id = p.id join factura f on f.id = fd.factura_id join cliente c
on f.cliente_id = c.id
group by c.nombre
order by gasto desc*/

--3. Top monedas más utilizadas
/*select m.nombre, count(f.moneda_id) from factura f join moneda m on f.moneda_id = m.id
group by m.nombre
order by count(f.moneda_id) desc*/

--4. Top proveedor de productos
/*select proveedor.nombre, COUNT(producto.id) cantidad FROM proveedor p JOIN producto ON producto.proveedor_id = proveedor.id
GROUP BY (proveedor.nombre)
ORDER BY (cantidad) DESC;*/

--5. Productos más vendidos
/*select p.nombre, sum(round(fd.cantidad)) from producto p join factura_detalle fd on p.id = fd.producto_id 
GROUP BY p.nombre
ORDER BY sum(fd.cantidad) desc*/

--6. Productos menos vendidos
/*select p.nombre, sum(round(fd.cantidad)) from producto p join factura_detalle fd on p.id = fd.producto_id 
GROUP BY p.nombre
ORDER BY sum(fd.cantidad)*/

--7.
/*Consulta que muestre fecha de emisión de factura, nombre y apellido del cliente, nombres de productos de esa factura, cantidades 
compradas, nombre de tipo de factura de una factura específica*/
/*select factura.id ,factura.fecha_emision, cliente.nombre, cliente.apellido, producto.nombre, factura_detalle.cantidad, factura_tipo.nombre 
from factura join cliente on factura.cliente_id = cliente.id join factura_detalle on factura_detalle.factura_id = factura.id
join producto on factura_detalle.producto_id = producto.id join factura_tipo on factura.factura_tipo_id = factura_tipo.id
order by factura.id desc*/

--8. Montos de facturas ordenadas según totales
/*select factura.id, sum(round(factura_detalle.cantidad*producto.precio)) as Monto from factura_detalle join producto on factura_detalle.producto_id = producto.id
join factura on factura.id = factura_detalle.factura_id
group by factura.id
order by sum(round(factura_detalle.cantidad*producto.precio)) desc*/

--9. Mostrar el iva 10% de los montos totales de facturas (suponer que todos los productos tienen IVA 10%)
select factura.id as NroFactura, round(sum((factura_detalle.cantidad*producto.precio)*0.11)) as MontoIva from factura_detalle join producto on factura_detalle.producto_id = producto.id
join factura on factura.id = factura_detalle.factura_id
group by factura.id
order by round(sum((factura_detalle.cantidad*producto.precio)*0.11))

























