<div class="container">
	<h1>Billing Desk</h1>

	<table id="bill" class="table table-hover table-condensed">
		<thead>
			<tr>
				<th style="width: 50%">Product</th>
				<th style="width: 10%">Price</th>
				<th style="width: 8%">Quantity</th>
				<th style="width: 22%" class="text-center">Subtotal</th>
				<th style="width: 10%"></th>
			</tr>
		</thead>


		<tbody>
			<c:forEach items="${cartLines }" var="cartLine">

				<tr>
					<td data-th="Product">
						<div class="row">
							<div class="col-sm-2 hidden-xs">
								<img
									src="${rootContext }/static/images/${cartLine.product.code}.jpg"
									alt="${cartLine.product.name }" class="img-responsive cartImg" />
							</div>
							<div class="col-sm-10">
								<h4 class="nomargin">${cartLine.product.name }
									<c:if test="${cartLine.available == false }">
										<strong class="unavailable">(Not Available)</strong>
									</c:if>

								</h4>
								<p>Brand - ${cartLine.product.brand }</p>
								<p>Description - ${cartLine.product.description }</p>
							</div>
						</div>
					</td>
					<td data-th="Price">&#8377; ${cartLine.buyingPrice }</td>
					<td data-th="Quantity">${cartLine.productCount }</td>
					<td data-th="Subtotal" class="text-center">&#8377;
						${cartLine.total }</td>

				</tr>

			</c:forEach>


		</tbody>


		<tfoot>
			<tr class="visible-xs">
				<td class="text-center"><strong>Total &#8377;
						${userModel.cart.grandTotal }</strong></td>
			</tr>
			<tr>

				<td colspan="2" class="hidden-xs"></td>
				<td class="hidden-xs text-center"><strong>Total
						&#8377; ${userModel.cart.grandTotal }</strong></td>

			</tr>
		</tfoot>

	</table>



	<table>

		<div class="panel-body">
			<!-- Form Elements -->
			<sf:form class="form-horizontal" modelAttribute="customer"
				action="/bill/addCustomer" method="POST"
				enctype="multipart/form-data">
				<div class="form-group">
					<label class="control-label col-md-4" for="contactNumber">Enter
						Customer Contact Number* : </label>

					<div class="col-md-8">
						<sf:input type="text" path="contactNumber" id="contactNumber"
							placeholder="Customer Contact Number" class="form-control" size="10" />
						<sf:errors path="contactNumber" cssClass="help-block" element="em" />

					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="name">Enter
						Customer Name : </label>
					<div class="col-md-8">
						<sf:input type="text" path="name" id="name"
							placeholder="Customer Name " class="form-control" />
						<sf:errors path="name" cssClass="help-block" element="em" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="isEmployee">Are
						you employee ? : </label>

					<div class="col-md-8">
						<sf:radiobutton path="isEmployee" value="Y" />
						<sf:errors path="isEmployee" cssClass="help-block" element="em" />

					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-md-4" for="isAffiliated">Are
						you Affiliated Customer ? : </label>

					<div class="col-md-8">
						<sf:radiobutton path="isAffiliated" value="Y" />
						<sf:errors path="isEmployee" cssClass="help-block" element="em" />

					</div>
				</div>
				
				<div class="form-group">
					<div class="col-md-offset-4 col-md-8">
						<input type="submit" name="submit" id="submit" value="Submit"
							class="btn btn-primary" />
							 <sf:hidden path="totalAmount" value="${userModel.cart.grandTotal }"/>

					</div>
				</div>

			</sf:form>

		</div>
		
		 <div class="row">
        <c:if test="${not empty message }">
            <div class="col-xs-12">
                <div class="alert alert-success alert-dismissible">
                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                        ${message }
                </div>
            </div>
        </c:if>

	</table>


</div>