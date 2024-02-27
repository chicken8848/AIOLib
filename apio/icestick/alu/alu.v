`include "../boolean_unit/boolean_unit.v"
`include "../shifter/shifter.v"
`include "../compare_unit/compare_unit.v"
`include "../wallace_tree/wallace_tree.v"
`include "../muxes/x_bit_mux_2.v"
`include "../muxes/x_bit_mux_4.v"
`include "../addersub/adder_sub.v"
`include "../shifter/x_bit_shr.v"
`include "../shifter/x_bit_shifter.v"

module alu #(
  parameter WIDTH = 32
)
(
    input [WIDTH-1:0] a,
    input [WIDTH-1:0] b,
    input [5:0] alufn,
    output [WIDTH-1:0] out,
    output z,
    output n,
    output v
);
wire [WIDTH-1:0] adder_result;
wire [63:0] mu_mul;
wire [WIDTH-1:0] mul_out;
wire [WIDTH-1:0] m1_out;
wire [WIDTH-1:0] shft_out;
wire [WIDTH-1:0] b_out;
wire [WIDTH-1:0] cmp_out;
wire cmp;
wire z_out;
wire v_out;
wire n_out;

assign cmp_out = cmp;
assign z = z_out;
assign v = v_out;
assign n = n_out;

x_bit_mux_2 #(.WIDTH(WIDTH)) mul_mux(.s(alufn[0]), .a(mu_mul[WIDTH-1:0]), .b(mu_mul[2*WIDTH-1:WIDTH]), .out(mul_out));
x_bit_mux_2 #(.WIDTH(WIDTH)) m1(.s(alufn[1]), .a(adder_result), .b(mul_out), .out(m1_out));
x_bit_mux_4 #(.WIDTH(WIDTH)) m2(.s0(alufn[4]), .s1(alufn[5]), .a(m1_out), 
  .b(b_out), .c(shft_out), .d(cmp_out), .out(out));
boolean_unit #(.WIDTH(WIDTH)) b_u (.a(a), .b(b), .alufn_sig(alufn[3:0]), .out(b_out));
shifter #(.BITS(WIDTH)) shft(.a(a), .b(b[4:0]), .alufn(alufn[1:0]), .out(shft_out));
compare_unit c_u(.z(z_out), .v(v_out), .n(n_out), .alu_fn(alufn[2:1]), .b_o(cmp));
WallaceTreeMul mu(.A(a), .B(b), .C(mu_mul));
adder_sub #(.WIDTH(WIDTH)) adder(.a(a), .b(b), .z_out(z_out), .n_out(n_out), 
  .v_out(v_out), .alufn(alufn[0]), .result(adder_result));

endmodule
