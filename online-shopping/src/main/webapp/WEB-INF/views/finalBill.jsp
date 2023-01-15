<div class="container">
	<h1>Billing Desk</h1>

	<table>

		 <div class="row">
        <c:if test="${not empty message }">
            <div class="col-xs-12">
                      <div class="text-center">
                    <h1> ${message }</h1>

                </div>
                      
                       
                </div>
            </div>
        </c:if>
        
        
           <tfoot>
              
                <tr>
                    <td><a href="${contextRoot }/show/all/products" class="btn btn-warning"><span
                            class="glyphicon glyphicon-chevron-left"></span> Continue
                        Shopping</a></td>
                    <td><a href="#" class="btn btn-success btn-block">Pay Here
                        <span class="glyphicon glyphicon-chevron-right"></span>
                    </a></td>
                </tr>
                </tfoot>

	</table>


</div>