<!DOCTYPE html>
<html lang="es" dir="ltr" data-light-ogb="true">
   <head>
      <meta charset="utf-8">
      <meta name="viewport" content="initial-scale=1.0,minimum-scale=1.0,width=device-width"/>
      <title>Restaurantes</title>
      <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet" type="text/css">
      <link href="https://fonts.googleapis.com/css?family=Google+Sans:300,400,500" rel="stylesheet" type="text/css">
      <link href="css/NewStyle.css" rel="stylesheet" type="text/css"/>
      <!-- from GH -->
      <link crossorigin="anonymous" media="all" integrity="sha512-RPWwIpqyjxv5EpuWKUKyeZeWz9QEzIbAWTiYOuxGieUq7+AMiZbsLeQMfEdyEIUoNjLagHK0BEm92BmXnvaH4Q==" rel="stylesheet" href="https://github.githubassets.com/assets/frameworks-40c1c9d8ff06284fb441108e6559f019.css" />
      <link crossorigin="anonymous" media="all" integrity="sha512-3CnDMoFJPvbM39ryV5wc51yRo/6j6eQPt5SOlYaoBZhR9rVL/UZH3ME+wt72nsTlNFaSQ3nXT/0F4sxE1zbA6g==" rel="stylesheet" href="https://github.githubassets.com/assets/github-38162889e1878fa3b887aa360e70ab6c.css" />
      <!-- END GH -->
      <meta name="viewport" content="width=device-width">

   </head>
   <body style="background-color: #f5f5f5;">
      <header class="blackNav" style="background-color: black;display: inline-block;width: 100%; height: 82px;">
         <h2 style="color: white;" class="clearfix">iaw-Milestone-2</h2>
         <button class="button btn" class="clearfix">Hoteles</button>
         <button class="btn-secondary btn" class="clearfix"  >Restaurantes</button>
         <button class="btn-danger btn" class="clearfix" style="cursor: not-allowed;">Actividades</button>
      </header>
      <div style="margin-top: 12px;">
      </div>
      <div style="margin-top: 14px;">
      </div>
      <div class="container-fluid clearfix"></div>
      <br>
      <div role="main" class="application-main " style="background-color: white;">
         <div id="js-pjax-container" data-pjax-container="" style="background-color: white";>
            <div class="container-lg clearfix px-3 mt-4" style="background-color: transparent">
               <div class="h-card col-3 float-left pr-3" style="background-color:white;">
                  <span class="p-name vcard-fullname d-block overflow-hidden" itemprop="name">Restaurantes</span>
                  <hr>
                  <div class="vcard-names-container py-3 js-sticky js-user-profile-sticky-fields" style="position: static;">
                     <h1 class="vcard-names">
                        <span class="p-name vcard-fullname d-block overflow-hidden" itemprop="name">Formulario de Registro</span>
                        <span class="p-nickname vcard-username d-block" itemprop="additionalName">¡Registre Ahora su Restaurante!</span>
                     </h1>
                     <form method="post" action="/addrest">
                        <input type="text" class="form-control" id="nameHotel" name="name" required placeholder="Nombre del restaurante"/>
                        <input type="text" class="form-control" id="nameHotel" name="imgUri" required placeholder="Pais"/>
                        <input type="text" class="form-control" id="nameHotel" name="description" required placeholder="Breve Descripcion"/>
                        <input type="text" class="form-control" id="nameHotel" name="precio" required placeholder="Precio"/>

                        <button class="btn" value="Submit" type="submit">Añadir</button>

                     </form>
                     <hr>
                     <br>
                     <h5 style="font-family: 'Palatino Linotype'">Buscador por ID</h5>
                     <form class="form" method="post" action="/findRest">
                        <input type="text" name="uuid" class="form-control device-width js-autosearch-field" placeholder="Ejemplo: 12da0186-8033" required/>

                        <button class="btn" type="submit" value="submit">Buscar</button>

                     </form>
                  </div>
               </div>
               <div class="col-9 float-left pl-2">
                  <div class="position-relative">
                     <div class="border-bottom border-gray-dark py-3">
                        <form action="/Allz" method="POST">
                           <div class="TableObject-item TableObject-item--primary pr-4">
                              <input type="text"  name="" style="width: 300px;" class="form-control width-full js-autosearch-field" placeholder="Busque un Hotel,Restaurante,Actividad..." autocomplete="off" aria-label="Busque un Hotel,Restaurante,Actividad..." value="">
                           </div>
                           <div class="TableObject-item text-right">
                              <div class="select-menu d-inline-block js-menu-container js-select-menu select-menu-modal-right">
                                 <select class="btn select-menu-button js-menu-target" type="button" aria-haspopup="true" aria-expanded="false">
                                    <option class="js-select-button" selected="">Categories</option>
                                    <option class="js-select-button">Hotels</option>
                                    <option class="js-select-button">Restaurants</option>
                                    <option class="js-select-button">Activities</option>
                                 </select>
                              </div>
                              <button class="button btn ml-3" type="submit" value="Search">
                              SEARCH
                              </button>
                           </div>
                        </form>
                     </div>
                     <div id="user-repositories-list">
                        <ul data-filterable-for="your-repos-filter" data-filterable-type="substring">
                           <!-- Esto es lo que muestra cuando se realiza una búqueda por ID -->
                           <#if uu??>
                           <div class="container-fluid" style="background-color: khaki;">
                              <div class="row">
                                 <div class="col-12 mt-3">
                                    <div class="card">
                                       <div class="card-horizontal">
                                          <div class="img-square-wrapper">
                                             <img class="" src="/img/restaurante.jpg" alt="Rest" style="border: 2px solid black; border-radius: 5px;width: 300px;height: 190px;">
                                          </div>
                                          <div class="card-body">
                                             <h3 class="card-title">${uu.name}</h3>
                                             <cite>
                                                <h6 class="card-title">${uu.id}</h6>
                                             </cite>
                                             <h2 class="card-title" style="color: darkred;">${uu.precio} €</h2>
                                             <p class="card-text">${uu.description}</p>
                                          </div>
                                       </div>
                                       <div class="card-footer">
                                          <small class="text-muted">Last updated 1 mins ago</small>
                                          <button type="button" class="btn btn-outline-primary align-items-end clearfix"><a href="/delete/${uu.id}">BORRAR</a></button>
                                          <button type="button" class="btn btn-outline-primary align-items-end clearfix"><a href="/update/${uu.id}">UPDATE</a></button>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                           </#if>
                           <!-- Fin búsqueda por UUID -->
                           <#if rest??>
                           <#list rest as m>
                           <div class="container-fluid">
                              <div class="row">
                                 <div class="col-12 mt-3">
                                    <div class="card">
                                       <div class="card-horizontal">
                                          <div class="img-square-wrapper">
                                             <img class="" src="/img/restaurante.jpg" alt="Hotel" style="border: 2px solid black; border-radius: 5px;width: 300px;height: 190px;">
                                          </div>
                                          <div class="card-body">
                                             <h3 class="card-title">${m.name}</h3>
                                             <cite>
                                                <h6 class="card-title">${m.id}</h6>
                                             </cite>
                                             <h2 class="card-title" style="color: darkred;">${m.precio} €</h2>
                                             <p class="card-text">${m.description}</p>
                                          </div>
                                       </div>
                                       <div class="card-footer">
                                          <small class="text-muted">Last updated 3 mins ago</small>
                                          <button type="button" class="btn btn-outline-primary align-items-end clearfix">        <a href="/delete/${m.id}">BORRAR</a></button>
                                          <button type="button" class="btn btn-outline-primary align-items-end clearfix">        <a href="/update/${m.id}">UPDATE</a></button>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                           <hr>
                           </#list>
                           </#if>
                           <#if act??>
                           <#list act as act>
                           <div class="container-fluid">
                              <div class="row">
                                 <div class="col-12 mt-3">
                                    <div class="card">
                                       <div class="card-horizontal">
                                          <div class="img-square-wrapper">
                                             <img class="" src="/img/actividad.jpg" alt="Hotel" style="border: 2px solid black; border-radius: 5px;width: 300px;height: 190px;">
                                          </div>
                                          <div class="card-body">
                                             <h3 class="card-title">${act.name}</h3>
                                             <cite>
                                                <h6 class="card-title">${act.id}</h6>
                                             </cite>
                                             <h2 class="card-title" style="color: darkred;">${act.precio} €</h2>
                                             <p class="card-text">${act.description}</p>
                                          </div>
                                       </div>
                                       <div class="card-footer">
                                          <small class="text-muted">Last updated 3 mins ago</small>
                                          <button type="button" class="btn btn-outline-primary align-items-end clearfix">        <a href="/delete/${act.id}">BORRAR</a></button>
                                          <button type="button" class="btn btn-outline-primary align-items-end clearfix">        <a href="/update/${act.id}">UPDATE</a></button>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>

                           </#list>
                           </#if>

                        </ul>
                        <br>
                        <br>
                        <br>
                        <br>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <br>
         <br><br>
         <br>
      </div>
      <br>
      <br>
      <footer style="height: 70px;text-align: center;"> <span class="p-name vcard-fullname d-block overflow-hidden" itemprop="name">Restaurantes | Antonio Nicolau Batle - Milestone  2 - FPGS 2º</span></footer>
   </body>
</html>