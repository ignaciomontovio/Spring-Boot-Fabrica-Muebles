package com.kui.app.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kui.app.VentaMuebleYCodigoDeBarras;
import com.kui.app.entity.cliente.Cliente;
import com.kui.app.entity.cliente.Telefono;
import com.kui.app.entity.codigoDeBarras.CodigoDeBarras;
import com.kui.app.entity.mueble.Mueble;
import com.kui.app.entity.mueble.color.Color;
import com.kui.app.entity.mueble.tipoMueble.Alfombra;
import com.kui.app.entity.mueble.tipoMueble.Baul;
import com.kui.app.entity.mueble.tipoMueble.Carpa;
import com.kui.app.entity.mueble.tipoMueble.Escalera;
import com.kui.app.entity.mueble.tipoMueble.Estante;
import com.kui.app.entity.mueble.tipoMueble.Mesa;
import com.kui.app.entity.mueble.tipoMueble.Silla;
import com.kui.app.entity.venta.Venta;
import com.kui.app.entity.venta_mueble.VentaMueble;
import com.kui.app.service.IClienteService;
import com.kui.app.service.ITelefonoService;
import com.kui.app.service.codigoDeBarras.ICodigoDeBarrasService;
import com.kui.app.service.mueble.IMuebleService;
import com.kui.app.service.mueble.color.IColorService;
import com.kui.app.service.mueble.tipoMueble.BaulServiceImpl;
import com.kui.app.service.mueble.tipoMueble.IAlfombraService;
import com.kui.app.service.mueble.tipoMueble.IBaulService;
import com.kui.app.service.venta.IVentaService;
import com.kui.app.service.ventaMueble.IVentaMuebleService;

@Controller
public class CrearClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IColorService colorService;
	
	@Autowired
	private ITelefonoService telefonoService;
	
	@Autowired
	private IAlfombraService alfombraService;
	
	@Autowired
	private IBaulService baulService;
	
	@Autowired
	private IMuebleService muebleService;
	
	@Autowired
	private ICodigoDeBarrasService codigoDeBarrasService;
	
	@Autowired
	private IVentaService ventaService;
	
	@Autowired
	private IVentaMuebleService ventaMuebleService;
	
	@GetMapping("/CrearCliente")
	public String indexCrearCliente(Model model) {
		model.addAttribute("clientes", clienteService.listarTodos());
		model.addAttribute("cliente",new Cliente());
		model.addAttribute("telefono",new Telefono());
		return "CrearCliente";
	}
	
	@PostMapping("/saveCliente")
	public String guardar(@ModelAttribute Cliente cliente) {
		
		clienteService.guardar(cliente);
		return "redirect:/CrearCliente";
	}
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") int idCliente,Model model) {
		model.addAttribute("clientes", clienteService.listarTodos());
		model.addAttribute("cliente",clienteService.buscarPorId(idCliente));
		System.out.println(clienteService.buscarPorId(idCliente));
		model.addAttribute("telefono",new Telefono());
		return "CrearCliente";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idCliente,Model model) {
		clienteService.eliminar(idCliente);
		return "redirect:/CrearCliente";
	}
	/*-----------------------------------------------------*/
	
	@GetMapping("/deleteAlfombra/{id}")
	public String eliminarAlfombra(@PathVariable("id") int id_Mueble,Model model) {
		alfombraService.eliminar(id_Mueble);
		return "redirect:/CrearMueble";
	}
	
	@PostMapping("/saveAlfombra")
	public String guardarAlfombra(@ModelAttribute Alfombra alfombra)
	{
		alfombraService.guardar(alfombra);
		return "redirect:/CrearMueble";
	}
	/*-----------------------------------------------------*/
	@GetMapping("/deleteBaul/{id}")
	public String eliminarBaul(@PathVariable("id") int id_Mueble,Model model) {
		baulService.eliminar(id_Mueble);
		return "redirect:/CrearMueble";
	}
	
	@PostMapping("/saveBaul")
	public String guardarBaul(@ModelAttribute Baul baul)
	{
		System.out.println(baul);
		baulService.guardar(baul);
		return "redirect:/CrearMueble";
	}
	/*-----------------------------------------------------*/
	
	@PostMapping("/saveCodigoDeBarras")
	public String guardarBaul(@ModelAttribute CodigoDeBarras codigoDeBarras)
	{
		codigoDeBarrasService.guardar(codigoDeBarras);
		return "redirect:/AsignarCodigoDeBarras";
	}
	/*-----------------------------------------------------*/
	
	@PostMapping("/saveTelefono")
	public String guardar(@ModelAttribute Telefono telefono)
	{
		telefonoService.guardar(telefono);
		return "redirect:/CrearCliente";
	}
	
	/*-----------------------------------------------------*/
	
	@GetMapping("/CrearMueble")
		public String indexCrearMueble(Model model)
		{
			model.addAttribute("colores", colorService.listarTodos());
//			model.addAttribute("mueble", new Mueble());
			model.addAttribute("alfombra", new Alfombra());
			model.addAttribute("alfombras", alfombraService.obtenerAlfombras());
			model.addAttribute("baul", new Baul());
			model.addAttribute("baules", baulService.obtenerBaules());
			model.addAttribute("carpa", new Carpa());
			model.addAttribute("escalera", new Escalera());
			model.addAttribute("estante", new Estante());
			model.addAttribute("mesa", new Mesa());
			model.addAttribute("silla", new Silla());
			return "CrearMueble";
		}
	
	/*-----------------------------------------------------*/
	@GetMapping("/CrearVenta")
	public String indexCrearVenta(Model model)
	{
		model.addAttribute("venMueElim", new VentaMueble());
		model.addAttribute("venta", new Venta());
		model.addAttribute("ventas", ventaService.listarTodos());
		model.addAttribute("clientes", clienteService.listarTodos());
		model.addAttribute("alfombras", alfombraService.obtenerAlfombras());
		model.addAttribute("baules", baulService.obtenerBaules());
		model.addAttribute("ventaMueble", new VentaMueble());
		return "CrearVenta";
	}
	
	@PostMapping("/saveVenta")
	public String guardarVenta(@ModelAttribute Venta venta)
	{
		ventaService.guardar(venta);
		return "redirect:/CrearVenta";
	}
	
	
	@GetMapping("/deleteMuebleVenta/{id_Mueble}/{id_Venta}")
	public String eliminarVentaMueble(@PathVariable("id_Mueble") Integer id_Mueble,@PathVariable("id_Venta") Integer id_Venta,Model model) {
		VentaMueble ventaMueble = ventaMuebleService.buscarPorId(id_Venta, id_Mueble).get(0);
		Set<CodigoDeBarras> codigosDeBarras = ventaMueble.getCodigosDeBarras();
		
		if(codigosDeBarras.size() > 0)
			for (CodigoDeBarras codigo : codigosDeBarras) {
				codigo.setVentaMueble(null);
				codigoDeBarrasService.guardar(codigo);
			}
//		System.out.println(ventaMueble.getId().getId_Mueble()+"----------------------"+ventaMueble.getId().getId_Venta());
		ventaMuebleService.eliminar(ventaMueble.getId());
		return "redirect:/CrearVenta";
	}
	
//	@PostMapping("/deleteMuebleVenta")
//	public String eliminarVentaMueble(@ModelAttribute VentaMueble ventaMueble)
//	{
//		Set<CodigoDeBarras> codigosDeBarras = ventaMueble.getCodigosDeBarras();
//		System.out.println("----------------------------------------------------------------------------\n");
//		System.out.println(ventaMueble);
//		for (CodigoDeBarras codigo : codigosDeBarras) {
//			codigo.setVentaMueble(null);
//			codigoDeBarrasService.guardar(codigo);
//		}
//		ventaMuebleService.eliminar(ventaMueble.getId());
//		return "redirect:/CrearVenta";
//	}
	
	
	@PostMapping("/saveVentaMueble")
	public String guardarVentaMueble(@ModelAttribute VentaMueble ventaMueble)
	{
		ventaMuebleService.guardar(ventaMueble);
		return "redirect:/CrearVenta";
	}
	/*-----------------------------------------------------*/
	
	@GetMapping("/Color")
	public String indexColor(Model model)
	{
		model.addAttribute("color", new Color());
		model.addAttribute("colores", colorService.listarTodos());
		return "caracteristicasMuebles/Color";
	}
	
	/*-----------------------------------------------------*/
	@GetMapping("/AsignarCodigoDeBarras")
	public String indexAsignarCodigoDeBarras(Model model)
	{
		model.addAttribute("codigoDeBarras", new CodigoDeBarras());
		model.addAttribute("codigosDeBarras", codigoDeBarrasService.listarTodos());
		model.addAttribute("alfombras", alfombraService.obtenerAlfombras());
		model.addAttribute("baules", baulService.obtenerBaules());
		return "AsignarCodigoDeBarras";
	}
	/*-----------------------------------------------------*/
	@GetMapping("/PedidosAFabricar")
	public String indexPedidosAFabricar(Model model)
	{
		return "PedidosAFabricar";
	}
	/*-----------------------------------------------------*/
	@GetMapping("/FinalizarVenta")
	public String indexFinalizarVenta(Model model)
	{
		model.addAttribute("ventaMuebleYCodigoDeBarras", new VentaMuebleYCodigoDeBarras());
		model.addAttribute("codigosDeBarras", codigoDeBarrasService.listarTodos());
		model.addAttribute("ventas", ventaService.listarTodos());
		model.addAttribute("ventasMuebles",ventaMuebleService.listarTodos());
		model.addAttribute("ventaMueble",new VentaMueble());
		return "FinalizarVenta";
	}
	
	@PostMapping("/asignarCodigoAVenta")
	public String asignarCodigoAVenta(@ModelAttribute VentaMuebleYCodigoDeBarras venMueCod)
	{
//		System.out.println("-------------------------------------------------------\n");
//		System.out.println(venMueCod.toString());
//		System.out.println("-------------------------------------------------------\n");
//		VentaMueble venMue = ventaMuebleService.buscarPorId(1,2).get(0);
//			System.out.println("-------------------------------------------------------\n");
//			System.out.println(venMue);
//			System.out.println("-------------------------------------------------------\n");
//		venMue.agregarCodigoDeBarras(new CodigoDeBarras(venMueCod.getNumeroCodigoDeBarras()));
//		ventaMuebleService.guardar(venMue);
		Mueble muebleAux = new Mueble(venMueCod.getId_Mueble());
		codigoDeBarrasService.guardar(new CodigoDeBarras(venMueCod.getNumeroCodigoDeBarras(),muebleAux,new VentaMueble(muebleAux,new Venta(venMueCod.getId_Venta()))));
																
		return "redirect:/FinalizarVenta";
	}
	
	@GetMapping("/deleteMuebleCodigoDeBarras/{id}")
	public String eliminarMuebleCodigoDeBarras(@PathVariable("id") Integer numeroCodigoDeBarras,Model model) {
		CodigoDeBarras codigoAux = codigoDeBarrasService.buscarPorId(numeroCodigoDeBarras);
		codigoAux.setVentaMueble(null);
		codigoDeBarrasService.guardar(codigoAux);
		return "redirect:/FinalizarVenta";
	}
	


	/*-----------------------------------------------------*/
	
	@PostMapping("/saveColor")
	public String guardarColor(@ModelAttribute Color color)
	{
		colorService.guardar(color);
		return "redirect:/Color";
	}
/*-----------------------------------------------------*/
	
	
}
